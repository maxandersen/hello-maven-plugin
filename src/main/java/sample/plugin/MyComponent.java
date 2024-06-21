package sample.plugin;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

import org.apache.maven.execution.MavenSession;

@Named
@Singleton
class MyComponent {

  @Inject
  MavenSession session;

  public String getExecutionRootDirectory() {
    return session.getExecutionRootDirectory();
  }

}