

package org.owasp.webgoat.lessons.spoofcookie;

import org.owasp.webgoat.container.lessons.Category;
import org.owasp.webgoat.container.lessons.Lesson;
import org.springframework.stereotype.Component;

/***
 *
 * @author Angel Olle Blazquez
 *
 */

@Component
public class SpoofCookie extends Lesson {

  @Override
  public Category getDefaultCategory() {
    return Category.A1;
  }

  @Override
  public String getTitle() {
    return "spoofcookie.title";
  }
}
