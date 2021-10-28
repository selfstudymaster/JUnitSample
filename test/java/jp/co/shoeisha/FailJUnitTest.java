package jp.co.shoeisha;

import org.junit.Test;
import static org.junit.Assert.*;

public class FailJUnitTest {

    /**
     * Integer.parseIntの引数に数字文字列以外を設定することで
     * NumberFormatExceptionがthrowされることと、
     * 設定されるメッセージの確認.
     */
    @Test
    public void executeTest() {
        try {
            Integer integer = Integer.parseInt("abcd");
            //Exceptionがthrowされるはずなので、ここにきたらそもそも失敗
            fail();
        } catch(NumberFormatException e) {
            //Exceptionのメッセージが想定どおりか確認
            assertEquals("For input string: \"abcd\"", e.getMessage());
        }
    }
}
