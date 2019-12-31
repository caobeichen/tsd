package com.lushe.tsd.core.enums;

/**
 * @author lushe
 * @date 2019/12/31 2:19 PM
 * @Des: job status
 **/
public enum JobStatusEnum implements IEnum {

    /**
     * ready , job is ready to execut
     */
    READY("READY", "", "", ""),

    /**
     * jod is working
     */
    RUNNING("RUNNING", "", "", ""),

    ERROR("ERROR","","",""),

    FINISHED("FINISHED","","","")
    ;

    private String code;

    private String name;

    private String chineseName;

    private String desc;

    JobStatusEnum(String code, String name, String chineseName, String desc) {
        this.code = code;
        this.name = name;
        this.chineseName = chineseName;
        this.desc = desc;
    }

    /**
     * get enum code
     *
     * @return
     */
    @Override
    public String getCode() {
        return null;
    }

    /**
     * get enum chinese name
     *
     * @return
     */
    @Override
    public String getChineseName() {
        return null;
    }

    /**
     * get enum name
     *
     * @return
     */
    @Override
    public String getName() {
        return null;
    }

    /**
     * get enum desc
     *
     * @return
     */
    @Override
    public String getDesc() {
        return null;
    }
}
