package som.openapi.test.generator.utils;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;

public class PluginUtils {
	public static IContainer createMavenProject(String projectName, IProgressMonitor monitor) throws CoreException, IOException, URISyntaxException {

		IProject project = ResourcesPlugin.getWorkspace().getRoot()
				.getProject(projectName);

	
		if (!project.exists()) {
			project.create(monitor);
			project.open(monitor);}
			extractJar(Platform.getBundle("som.openapi.test.generator").getEntry("libs/maven-project.jar"), new File(project.getLocationURI()));
			project.refreshLocal(IResource.DEPTH_INFINITE, null);
			IProjectDescription description = project.getDescription();
			description.setNatureIds(new String[] { JavaCore.NATURE_ID,
					"org.eclipse.m2e.core.maven2Nature" });
			project.setDescription(description, monitor);
			IJavaProject javaProject = JavaCore.create(project);
				



			
			project.refreshLocal(IResource.DEPTH_INFINITE, monitor);
	
				
		return project;
	}
	
	public static void extractJar(URL url, File destDir) throws IOException, URISyntaxException{
		java.util.jar.JarFile jar = new java.util.jar.JarFile(new File(FileLocator.resolve(url).toURI()).getAbsolutePath());
		java.util.Enumeration enumEntries = jar.entries();
		while (enumEntries.hasMoreElements()) {
		    java.util.jar.JarEntry file = (java.util.jar.JarEntry) enumEntries.nextElement();
		    java.io.File f = new java.io.File(destDir.getAbsolutePath() + java.io.File.separator + file.getName());
		    if (file.isDirectory()) { // if its a directory, create it
		        f.mkdir();
		        continue;
		    }
		    java.io.InputStream is = jar.getInputStream(file); // get the input stream
		    java.io.FileOutputStream fos = new java.io.FileOutputStream(f);
		    while (is.available() > 0) {  // write contents of 'is' to 'fos'
		        fos.write(is.read());
		    }
		    fos.close();
		    is.close();
		}
	}
}
