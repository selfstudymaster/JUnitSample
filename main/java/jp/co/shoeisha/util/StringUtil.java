package jp.co.shoeisha.util;

public class StringUtil {

    /**
     * 16進文字列作成.
     * 引数のbyte配列を元に、16進文字列を生成します。<br>
     * byte配列が {0,1,2}の場合、"000102"という文字列を返します。<br>
     * 引数のbyte配列がnullもしくはサイズ0の場合、空文字を返します。<br>
     * @param bytes バイト配列
     * @return 16進文字列
     */
    public static String toHexString(byte[] bytes) {

        if(bytes == null || bytes.length == 0) {
            return "";
        }

        StringBuffer sb = new StringBuffer();

        int size = bytes.length;
        for(int i = 0; i < size; i++) {
            int target = bytes[i];

            if(target < 0) {
                //負の値の場合、256を加算
                target += 256;
            }

            //数値を文字列変換
            String str = Integer.toString(target, 16);

            //1桁の場合、先頭に0付与
            if(str.length() == 1) {
                str = "0" + str;
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
