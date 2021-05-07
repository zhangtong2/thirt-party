package com.winhong.service;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestComputer {

    /**
     * 测试接口
     *
     * @return
     */
    @Test
    public String content() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("sdewe\n");
        stringBuffer.append("Finished, saving caches...\n" +
                "Compilation failed: errors: 1; warnings: 0\n" +
                "Executing post-compile tasks...\n" +
                "Loading Ant configuration...");
        Boolean flag = false;
        List<String> StringList = Lists.newArrayList();
        StringList.forEach(string -> {
            if (flag == true) {
                stringBuffer.append("结束");
            }
        });
        StringList.stream().filter(string -> string.equals("sss")).collect(Collectors.toList());
        ArrayList<Object> arrayList = Lists.newArrayList();
        arrayList.stream().filter(string -> string.equals(Resouce.FINAL_NAME)).collect(Collectors.toList());
        String state = ResouceType.FINAL_TYPE.state;
        return stringBuffer.toString();
    }

    /**
     * 接口常量
     */
    public interface Resouce {
        String FINAL_NAME = "final_name";
        String FINAL_ONE = "final_one";
        String FINAL_RESOUCE = "final_resouce";
    }

    public enum ResouceType {
        FINAL_TYPE("final_type", "ssss");

        private String desc;
        private String state;

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        ResouceType(String desc, String state) {
            this.desc = desc;
            this.state = state;
        }
    }

}
