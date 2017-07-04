

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLDecoder;
import java.util.Hashtable;
@SuppressWarnings({"unchecked","rawtypes"})
public class V3AppClassLoader extends ClassLoader {
    public V3AppClassLoader(ClassLoader classLoader){
        super(classLoader);
    }

    
	public Class loadClass(String className) throws ClassNotFoundException {
		System.out.println("Loading class " + className);
		if(className.startsWith("java") || className.startsWith("sun.")){
			Class clz = super.loadClass(className);
			return clz;
		}

		return findClass(className);
	}

	public Class findClass(String className) {
		System.out.println("Finding class: " + className);
		byte classByte[];
		Class result = null;
		result = (Class) classes.get(className);
		if (result != null) {
			return result;
		}

		try {
			System.out.println(className
					+ " : "
					+ ClassLoader.getSystemResource(className.replace('.',
							File.separatorChar) + ".class"));
			String classPath = ((String) ClassLoader.getSystemResource(
					className.replace('.', File.separatorChar) + ".class")
					.getFile()).substring(1);
			classByte = loadClassData(URLDecoder.decode(classPath));
			result = defineClass(className, classByte, 0, classByte.length,
					null);
			classes.put(className, result);
			return result;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	private byte[] loadClassData(String className) throws IOException {

		File f;
		f = new File(className);
		int size = (int) f.length();
		byte buff[] = new byte[size];
		FileInputStream fis = new FileInputStream(f);
		DataInputStream dis = new DataInputStream(fis);
		dis.readFully(buff);
		dis.close();
		return buff;
	}

	private Hashtable classes = new Hashtable();
}