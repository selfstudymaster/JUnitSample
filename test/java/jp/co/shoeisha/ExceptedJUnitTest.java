package jp.co.shoeisha;

import org.junit.Test;

public class ExceptedJUnitTest {

    /**
     * Integer.parseIntの引数に数字文字列以外を設定することで
     * NumberFormatExceptionがthrowされることの確認.
     */
    @Test(expected=NumberFormatException.class)
    public void executeTest() {
        Integer integer = Integer.parseInt("abcd");
    }

}
