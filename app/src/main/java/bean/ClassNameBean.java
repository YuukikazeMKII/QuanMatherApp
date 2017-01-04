package bean;

import java.util.List;

/**
 * Created by Administrator on 2016/12/30.
 */

public class ClassNameBean {
    /**
     * error_code : 0
     * error_msg :
     * data : {"category_one":[{"id":"1156","name":"本地生活","img":"http://image2.juanlaoda.com/AdminImageUpload/1165250.png"},{"id":"5417","name":"旅游酒店","img":"http://image1.juanlaoda.com/AdminImageUpload/6581500.png"},{"id":"569","name":"手机相机","img":"http://image2.juanlaoda.com/AdminImageUpload/4361010.png"},{"id":"5420","name":"家用电器","img":"http://image2.juanlaoda.com/AdminImageUpload/44388740.png"},{"id":"166","name":"电脑办公","img":"http://image1.juanlaoda.com/AdminImageUpload/3548817798.png"},{"id":"1","name":"图书音像","img":"http://image1.juanlaoda.com/AdminImageUpload/9235130.png"},{"id":"252","name":"美妆个护","img":"http://image2.juanlaoda.com/AdminImageUpload/48435610.png"},{"id":"763","name":"服饰鞋包","img":"http://image2.juanlaoda.com/AdminImageUpload/49589090.png"},{"id":"5416","name":"投资理财","img":"http://image3.juanlaoda.com/AdminImageUpload/28522020.png"},{"id":"647","name":"家居家装","img":"http://image3.juanlaoda.com/AdminImageUpload/59573260.png"},{"id":"299","name":"母婴玩具","img":"http://image2.juanlaoda.com/AdminImageUpload/217400.png"},{"id":"1045","name":"运动户外","img":"http://image3.juanlaoda.com/AdminImageUpload/5236985h.png"},{"id":"381","name":"食品饮料","img":"http://image2.juanlaoda.com/AdminImageUpload/31271115210356s.png"},{"id":"441","name":"汽车用品","img":"http://image1.juanlaoda.com/AdminImageUpload/6358290.png"},{"id":"879","name":"礼品钟表","img":"http://image2.juanlaoda.com/AdminImageUpload/428390.png"},{"id":"1316","name":"医药保健","img":"http://image3.juanlaoda.com/AdminImageUpload/5426330.png"},{"id":"1248","name":"其他分类","img":"http://image3.juanlaoda.com/AdminImageUpload/33552950.png"}]}
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
        private List<CategoryOneBean> category_one;

        public List<CategoryOneBean> getCategory_one() {
            return category_one;
        }

        public void setCategory_one(List<CategoryOneBean> category_one) {
            this.category_one = category_one;
        }

        public static class CategoryOneBean {
            /**
             * id : 1156
             * name : 本地生活
             * img : http://image2.juanlaoda.com/AdminImageUpload/1165250.png
             */

            private String id;
            private String name;
            private String img;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }
        }
    }
}
