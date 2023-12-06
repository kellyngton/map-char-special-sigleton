import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ReplaceSpecialCharsUtil {
    private static final ReplaceSpecialCharsUtil instance = new ReplaceSpecialCharsUtil();

    private ReplaceSpecialCharsUtil() {
    }

    public static ReplaceSpecialCharsUtil getInstance() {
        return instance;
    }

    private static Map<Integer, Integer> SPECIAL_CHARACTERS_MAP;
    private String strReplacedSpecialChars;

    static {
        Map<Integer, Integer> map = new HashMap<>();
        map = setSpecialCharMap(map);
        SPECIAL_CHARACTERS_MAP =
                Collections.unmodifiableMap(map);
    }

    String replaceSpecialChars(String input) throws InterruptedException {
        strReplacedSpecialChars = input;
        char[] stringCharArray = input.toCharArray();
        for (char character : stringCharArray) {
                        int unicodeChar = (int) character;
                        Integer findEspecialChar = getReplacementUnicode(unicodeChar);
                        if (findEspecialChar != null)
                            strReplacedSpecialChars = replaceChar(input, unicodeChar, findEspecialChar);
        } //como garantir que vou retornar o último resultado da iteração -> strReplaced
        return strReplacedSpecialChars;
    }

    private String replaceChar(String oldStr, int oldUnicodeInt, int newUnicodeInt) {
        String oldUnicodeChar = getFormatUnicodeChar(oldUnicodeInt);
        String newUnicodeChar = getFormatUnicodeChar(newUnicodeInt);
        return oldStr.replaceAll(oldUnicodeChar, newUnicodeChar);
    }

    private static String getFormatUnicodeChar(int oldUnicodeInt) {
        return String.format("\\u%04X", oldUnicodeInt);
    }

    private Integer getReplacementUnicode(int unicodeChar) {
        return SPECIAL_CHARACTERS_MAP.get(unicodeChar);
    }

    //alterar metodo padrão sigleton ---- DONE
    //refactor no nome dos atributos e métodos ---- DONE
    //verificar o uso de threads

    private static Map<Integer, Integer> setSpecialCharMap(Map<Integer, Integer> map) {
        if (SPECIAL_CHARACTERS_MAP == null) {
            map.put(34, 32);
            map.put(94, 32);
            map.put(96, 32);
            map.put(126, 32);
            map.put(127, 32);
            map.put(128, 67);
            map.put(129, 32);
            map.put(131, 102);
            map.put(132, 32);
            map.put(133, 32);
            map.put(134, 32);
            map.put(135, 32);
            map.put(136, 32);
            map.put(137, 32);
            map.put(138, 83);
            map.put(139, 32);
            map.put(140, 32);
            map.put(141, 32);
            map.put(142, 90);
            map.put(143, 32);
            map.put(144, 32);
            map.put(149, 32);
            map.put(152, 32);
            map.put(154, 115);
            map.put(155, 32);
            map.put(156, 32);
            map.put(157, 32);
            map.put(158, 122);
            map.put(159, 89);
            map.put(160, 32);
            map.put(161, 32);
            map.put(162, 99);
            map.put(163, 69);
            map.put(164, 32);
            map.put(165, 89);
            map.put(166, 32);
            map.put(167, 83);
            map.put(168, 32);
            map.put(169, 32);
            map.put(170, 32);
            map.put(171, 32);
            map.put(172, 32);
            map.put(174, 32);
            map.put(175, 32);
            map.put(176, 32);
            map.put(177, 32);
            map.put(178, 32);
            map.put(179, 32);
            map.put(180, 32);
            map.put(181, 117);
            map.put(182, 32);
            map.put(183, 32);
            map.put(185, 32);
            map.put(186, 32);
            map.put(187, 32);
            map.put(188, 32);
            map.put(189, 32);
            map.put(190, 32);
            map.put(191, 32);
            map.put(198, 32);
            map.put(216, 48);
            map.put(230, 32);
            map.put(247, 32);
            map.put(248, 48);
            map.put(254, 32);
        }
        return map;
    }
}
