package com.java.testCode.random;

import java.lang.instrument.ClassDefinition;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;
import java.lang.instrument.UnmodifiableClassException;
import java.util.jar.JarFile;

public class GetClassSize
{
	static Instrumentation i = new Instrumentation() {

		@Override
		public void setNativeMethodPrefix(ClassFileTransformer transformer, String prefix)
		{
			// TODO Auto-generated method stub

		}

		@Override
		public void retransformClasses(Class<?>... classes) throws UnmodifiableClassException
		{
			// TODO Auto-generated method stub

		}

		@Override
		public boolean removeTransformer(ClassFileTransformer transformer)
		{
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public void redefineClasses(ClassDefinition... definitions)
			throws ClassNotFoundException, UnmodifiableClassException
		{
			// TODO Auto-generated method stub

		}

		@Override
		public boolean isRetransformClassesSupported()
		{
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isRedefineClassesSupported()
		{
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isNativeMethodPrefixSupported()
		{
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean isModifiableClass(Class<?> theClass)
		{
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public long getObjectSize(Object objectToSize)
		{
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public Class[] getInitiatedClasses(ClassLoader loader)
		{
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Class[] getAllLoadedClasses()
		{
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void appendToSystemClassLoaderSearch(JarFile jarfile)
		{
			// TODO Auto-generated method stub

		}

		@Override
		public void appendToBootstrapClassLoaderSearch(JarFile jarfile)
		{
			// TODO Auto-generated method stub

		}

		@Override
		public void addTransformer(ClassFileTransformer transformer, boolean canRetransform)
		{
			// TODO Auto-generated method stub

		}

		@Override
		public void addTransformer(ClassFileTransformer transformer)
		{
			// TODO Auto-generated method stub

		}
	};

	public static void main(String[] args)
	{
		GetClassSize g1 = new GetClassSize();
		System.out.println();
		System.out.println(i.getObjectSize(i));

	}

}
