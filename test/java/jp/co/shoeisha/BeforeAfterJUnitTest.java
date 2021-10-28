package jp.co.shoeisha;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class BeforeAfterJUnitTest {

    /**
     * @Testが呼ばれる前に呼び出される前処理.
     */
    @Before
    public void before() {
        System.out.println("テストが呼ばれる前に出力.");
    }

    /**
     * @Testが呼ばれた後に呼び出される後処理.
     */
    @After
    public void after() {
        System.out.println("テストが呼ばれた後に出力.");
    }

    @Test
    public void executeTest() {
        System.out.println("テスト実行.");
    }

    /**
     * テスト失敗時でも@Afterが呼ばれることの確認.
     */
    @Test
    public void executeTest2() {
        System.out.println("テスト実行2(テストが失敗しても@Afterは呼ばれる)");
        Integer integer = Integer.parseInt("abcd");
    }
}
