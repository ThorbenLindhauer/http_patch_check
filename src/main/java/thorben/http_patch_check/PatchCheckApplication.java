package thorben.http_patch_check;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

public class PatchCheckApplication extends Application {

  @Override
  public Set<Class<?>> getClasses() {
    Set<Class<?>> classes = new HashSet<Class<?>>();
    classes.add(HttpPatchCheckResource.class);
    return classes;
  }
}
