/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 22 10:20:21 GMT 2017
 */

package emailService;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import emailService.EmailService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmailService_ESTest extends EmailService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmailService emailService0 = new EmailService();
      // Undeclared exception!
      try { 
        emailService0.sendEmail("4U.3Ka]2R#7B", "4U.3Ka]2R#7B");
        fail("Expecting exception: SecurityException");
      
      } catch(SecurityException e) {
         //
         // Access to default session denied
         //
         verifyException("javax.mail.Session", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EmailService emailService0 = new EmailService();
      // Undeclared exception!
      try { 
        emailService0.sendEmail((String) null, (String) null);
        fail("Expecting exception: SecurityException");
      
      } catch(SecurityException e) {
         //
         // Access to default session denied
         //
         verifyException("javax.mail.Session", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EmailService emailService0 = new EmailService();
      // Undeclared exception!
      try { 
        emailService0.sendEmail("Wg6sr/{6JA*j^YA", "");
        fail("Expecting exception: SecurityException");
      
      } catch(SecurityException e) {
         //
         // Access to default session denied
         //
         verifyException("javax.mail.Session", e);
      }
  }
}
