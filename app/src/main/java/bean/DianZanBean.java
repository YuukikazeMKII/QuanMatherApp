package bean;

/**
 * Created by Administrator on 2016/12/29.
 */

public class DianZanBean {

    /**
     * error_code : 0
     * error_msg :
     * data : {"msg":"打分成功","worthy_num":0,"unworthy_num":3}
     */

    private String error_code;
    private String error_msg;
    private DataBean data;

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    public String getError_msg() {
        return error_msg;
    }

    public void setError_msg(String error_msg) {
        this.error_msg = error_msg;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * msg : 打分成功
         * worthy_num : 0
         * unworthy_num : 3
         */

        private String msg;
        private int worthy_num;
        private int unworthy_num;

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public int getWorthy_num() {
            return worthy_num;
        }

        public void setWorthy_num(int worthy_num) {
            this.worthy_num = worthy_num;
        }

        public int getUnworthy_num() {
            return unworthy_num;
        }

        public void setUnworthy_num(int unworthy_num) {
            this.unworthy_num = unworthy_num;
        }
    }
}
