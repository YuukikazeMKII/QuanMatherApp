package utils;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

/**
 * Created by Administrator on 2016/12/28.
 */

public class RemoveString {
    public static String remove(String s){
        String replace = s.replace("file:///android_asset/", "src/main/assets/");
        return replace;
    }

    public static String RemoveS(String s){
        String string=s.replace("src/main/assets/js/JSBridge.js", "src/main/assets/js/WebViewJavascriptBridge.js");
        return string;
    }


    public static String RemoveHtml(String s){
        String string=s.replace(" <script type='text/javascript'>\n" +
                "                                                               \t\t    window.addEventListener('load',function(){\n" +
                "                                                               \t\t\t    var\timgs = document.getElementsByTagName(\"img\");\n" +
                "                                                               \t\t\t    for(var k=0; k < imgs.length; k++){\n" +
                "                                                               \t\t\t\t    (function(k){\n" +
                "                                                               \t\t\t\t\t    var hammerImg = new Hammer(imgs[k]);\n" +
                "                                                               \t\t\t\t\t    hammerImg.on(\"press\", function(e){\n" +
                "                                                               \t\t\t\t\t    e.preventDefault();\n" +
                "                                                               JSBridge.call(\"bridge\",\"decodeQRCode\",{\"img\":imgs[k].src},function(res){});\n" +
                "                                                               \t\t\t\t\t    });\n" +
                "                                                               \t\t\t\t    })(k);\n" +
                "                                                               \t\t\t    }\n" +
                "                                                               \t\t    });\n" +
                "                                                               \n" +
                "                                                               \n" +
                "                                                                           $(function(){\n" +
                "                                                                               if(navigator.userAgent.match(/iPhone|iPad|iPod/i)){\n" +
                "                                                                                   $('.footer_description').show();\n" +
                "                                                                               }\n" +
                "                                                                               $('img').each(function (i) {\n" +
                "                                                                                   $(this).css({'width':'100%','height':'auto'});\n" +
                "                                                                               });\n" +
                "                                                               \n" +
                "                                                                               $('p img').each(function(){\n" +
                "                                                                                   $(this).bind('error', function () {\n" +
                "                                                                                       $(this).css('display','none');\n" +
                "                                                                                   });\n" +
                "                                                                               });\n" +
                "                                                               \n" +
                "                                                                               var tureUrl = $('.trueUrl').attr('data-src');\n" +
                "                                                                               if(tureUrl){\n" +
                "                                                                                   $('.trueUrl').attr('src',tureUrl);\n" +
                "                                                                               };\n" +
                "                                                                        });\n" +
                "                                                               \n" +
                "                                                               function tagsOnClick(type, value, name) {\n" +
                "                                                               JSBridge.call(\"bridge\",\"tagsSkip\", {\"type\":type,\"value\":value,\"name\":name},function(res){});\n" +
                "                                                               }\n" +
                "                                                               \t</script>","function tagsOnClick(type, value, name) {\n" +
                "\n" +
                "            //call native method\n" +
                "            window.WebViewJavascriptBridge.callHandler('submitFromWeb'" +
                "                , {'param': name}\n" +
                "                , function(responseData) {\n" +
                "                }\n" +
                "            );\n" +
                "        }\n" +
                "\n" +
                "        function bridgeLog(logContent) {\n" +
                "            document.getElementById(\"show\").innerHTML = logContent;\n" +
                "        }\n" +
                "\n" +
                "        function connectWebViewJavascriptBridge(callback) {\n" +
                "            if (window.WebViewJavascriptBridge) {\n" +
                "                callback(WebViewJavascriptBridge)\n" +
                "            } else {\n" +
                "                document.addEventListener(\n" +
                "                    'WebViewJavascriptBridgeReady'\n" +
                "                    , function() {\n" +
                "                        callback(WebViewJavascriptBridge)\n" +
                "                    },\n" +
                "                    false\n" +
                "                );\n" +
                "            }\n" +
                "        }\n" +
                "\n" +
                "        connectWebViewJavascriptBridge(function(bridge) {\n" +
                "            bridge.init(function(message, responseCallback) {\n" +
                "                console.log('JS got a message', message);\n" +
                "                var data = {\n" +
                "                    'Javascript Responds': '测试中文!'\n" +
                "                };\n" +
                "                console.log('JS responding with', data);\n" +
                "                responseCallback(data);\n" +
                "            });\n" +
                "\n" +
                "            bridge.registerHandler(\"functionInJs\", function(data, responseCallback) {\n" +
                "                var responseData = \"Javascript Says Right back aka!\";\n" +
                "                responseCallback(responseData);\n" +
                "            });\n" +
                "        })");
        return string;
    }

    public static String fmtString(String str){
        String notice = "";
        try{
            notice = URLEncoder.encode(str, "utf-8");
        }catch(UnsupportedEncodingException ex){
        }
        return notice;
    }
}
