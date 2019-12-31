package com.lushe.tsd.core.enums;

/**
 * @author lushe
 * @date 2019/12/31 2:17 PM
 * @Des:
 **/
public interface IEnum {

    /**
     * get enum code
     *
     * @return
     */
    String getCode();

    /**
     * get enum chinese name
     *
     * @return
     */
    String getChineseName();

    /**
     * get enum name
     *
     * @return
     */
    String getName();

    /**
     * get enum desc
     *
     * @return
     */
    String getDesc();

    static <E extends Enum<?> & IEnum> E codeOf(Class<E> enumClass, String code) {
        E[] enumConstants = enumClass.getEnumConstants();
        for (E e : enumConstants) {
            if (e.getCode().equals(code)) {
                return e;
            }
        }

        throw new IllegalArgumentException();
    }
}
