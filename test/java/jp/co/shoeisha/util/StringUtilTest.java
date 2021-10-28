package jp.co.shoeisha.util; // package パッケージ名(テスト対象クラス名と同じにするのが良い);

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test; // import JUnit提供ライブラリ

public class StringUtilTest { // テストクラス名

    /**
     * 通常パターン.
     */
    @Test // アノテーションをテストメソッドの前に記述
    // @TestはJUnitからテストメソッドと認識され、実行時にJUnitからメソッドが呼び出される
    public void testNormal() { // テストメソッド名
    	// 比較メソッド
    	// expected要素を使うと例外がthrowされることをテスト対象クラスに期待する振る舞いとして定義できる
        byte[] bytes = new byte[3];
        bytes[0] = 0x00;
        bytes[1] = 0x01;
        bytes[2] = 0x02;
        String actual = StringUtil.toHexString(bytes);
        assertThat(actual, is("000102"));
    }

    /**
     * 通常パターン2.
     * 先頭ビットに1が立ち、負数になるケース
     */
    @Test
    public void testNormal2() {
        byte[] bytes = new byte[3];
        bytes[0] = -1;
        bytes[1] = 0x15;
        bytes[2] = (byte)0xff;
        String actual = StringUtil.toHexString(bytes);
        assertThat(actual, is("ff15ff"));
    }

}
