package bean;

import java.util.List;

/**
 * Created by Administrator on 2016/12/30.
 */

public class ClassMessageBean {


    /**
     * error_code : 0
     * error_msg :
     * data : {"types":[{"id":"","url":"","name":"热门分类","shops":[{"id":"658","url":"/mcat/658","name":"电热毯","img":"http://www.quanmama.com/images/categoryimg/2688.jpg"},{"id":"168","url":"/mcat/168","name":"笔记本","img":"http://www.quanmama.com/images/categoryimg/672.jpg"},{"id":"5387","url":"/mcat/5387","name":"打车","img":"http://image3.juanlaoda.com/AdminImageUpload/8318362.png"},{"id":"5391","url":"/mcat/5391","name":"外卖","img":"http://image3.juanlaoda.com/AdminImageUpload/1833982QQ截图20150911122035_副本.png"},{"id":"1187","url":"/mcat/1187","name":"电影票","img":"http://image1.juanlaoda.com/AdminImageUpload/47147721.png"},{"id":"5410","url":"/mcat/5410","name":"专车","img":"http://image3.juanlaoda.com/AdminImageUpload/59257320.png"},{"id":"5441","url":"/mcat/5441","name":"话费流量","img":"http://image3.juanlaoda.com/AdminImageUpload/852000.png"},{"id":"168","url":"/mcat/168","name":"笔记本","img":"http://www.quanmama.com/images/categoryimg/672.jpg"}]}]}
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
        private List<TypesBean> types;

        public List<TypesBean> getTypes() {
            return types;
        }

        public void setTypes(List<TypesBean> types) {
            this.types = types;
        }

        public static class TypesBean {
            /**
             * id :
             * url :
             * name : 热门分类
             * shops : [{"id":"658","url":"/mcat/658","name":"电热毯","img":"http://www.quanmama.com/images/categoryimg/2688.jpg"},{"id":"168","url":"/mcat/168","name":"笔记本","img":"http://www.quanmama.com/images/categoryimg/672.jpg"},{"id":"5387","url":"/mcat/5387","name":"打车","img":"http://image3.juanlaoda.com/AdminImageUpload/8318362.png"},{"id":"5391","url":"/mcat/5391","name":"外卖","img":"http://image3.juanlaoda.com/AdminImageUpload/1833982QQ截图20150911122035_副本.png"},{"id":"1187","url":"/mcat/1187","name":"电影票","img":"http://image1.juanlaoda.com/AdminImageUpload/47147721.png"},{"id":"5410","url":"/mcat/5410","name":"专车","img":"http://image3.juanlaoda.com/AdminImageUpload/59257320.png"},{"id":"5441","url":"/mcat/5441","name":"话费流量","img":"http://image3.juanlaoda.com/AdminImageUpload/852000.png"},{"id":"168","url":"/mcat/168","name":"笔记本","img":"http://www.quanmama.com/images/categoryimg/672.jpg"}]
             */

            private String id;
            private String url;
            private String name;
            private List<ShopsBean> shops;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public List<ShopsBean> getShops() {
                return shops;
            }

            public void setShops(List<ShopsBean> shops) {
                this.shops = shops;
            }

            public static class ShopsBean {
                /**
                 * id : 658
                 * url : /mcat/658
                 * name : 电热毯
                 * img : http://www.quanmama.com/images/categoryimg/2688.jpg
                 */

                private String id;
                private String url;
                private String name;
                private String img;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
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
}
