

package org.owasp.webgoat.lessons.sqlinjection.advanced;

import org.owasp.webgoat.container.lessons.Category;
import org.owasp.webgoat.container.lessons.Lesson;
import org.springframework.stereotype.Component;

@Component
public class SqlInjectionAdvanced extends Lesson {
  @Override
  public Category getDefaultCategory() {
    return Category.A3;
  }

  @Override
  public String getTitle() {
    return "2.sql.advanced.title";
  }
}
