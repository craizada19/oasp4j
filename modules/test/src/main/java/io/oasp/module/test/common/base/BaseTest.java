package io.oasp.module.test.common.base;

import org.assertj.core.api.Assertions;
import org.junit.After;
import org.junit.Before;

/**
 * This is the {@code abstract} base class for all tests. In most cases it will be convenient to extend this class. <br>
 * <br/>
 * Although it does not contain abstract methods, the class itself is declared {@code abstract} to clarify its purpose.
 * <br/>
 * <br/>
 * This class provides {@code final} methods {@link #setUp()} and {@link #tearDown()} which call {@code protected}
 * methods {@link #doSetUp()} and {@link #doTearDown()} internally. <br/>
 * Both methods {@link #doSetUp()} and {@link #doTearDown()} are left empty here. If some default behaviour is desired
 * during test setup or teardown these methods should be overridden by the subclass. <br/>
 * Implementations <b>must</b> call the super implementation. This call should always happen at the beginning of the
 * implementation. This helps to avoid confusion of call orders. <br/>
 * <br/>
 * The following listing should clarify the intention:
 *
 * <pre>
 * public class MyTest extends BaseTest {
 *
 *   &#64;Override
 *   protected void doSetUp() {
 *
 *     super.doSetUp();
 *     // ... my code
 *   }
 * }
 * </pre>
 *
 * @author shuber, jmolinar
 */
public abstract class BaseTest extends Assertions {

  /**
   * Suggests to use {@link #doSetUp()} method before each tests.
   */
  @Before
  public final void setUp() {

    doSetUp();
  }

  /**
   * Suggests to use {@link #doTearDown()} method before each tests.
   */
  @After
  public final void tearDown() {

    doTearDown();
  }

  /**
   * Provides initialization previous to the creation of the text fixture.
   */
  protected void doSetUp() {

  }

  /**
   * Provides clean up after tests.
   */
  protected void doTearDown() {

  }
}