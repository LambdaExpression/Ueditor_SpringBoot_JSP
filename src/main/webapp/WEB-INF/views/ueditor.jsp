<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
    <title>Ueditor</title>
    <script type="text/javascript" charset="utf-8" src="/static/js/jquery-3.1.1.min.js"></script>
    <script type="text/javascript" charset="utf-8" src="/static/js/ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="/static/js/ueditor/ueditor.all.min.js"></script>
    <script type="text/javascript" charset="utf-8" src="/static/js/ueditor/lang/zh-cn/zh-cn.js"></script>
    <script type="text/javascript" charset="utf-8" src="/static/js/ueditor/lang/en/en.js"></script>
</head>
<body>
<h2>Ueditor</h2>
<br>
<textarea id="myEditor" name="content" style="margin: 0px;width: 100%;height: 360px;"></textarea>

<script type="text/javascript">

    var ue = UE.getEditor('myEditor');

    UE.Editor.prototype._bkGetActionUrl = UE.Editor.prototype.getActionUrl;
    UE.Editor.prototype.getActionUrl = function (action) {
        if (action == 'uploadimage' || action == 'uploadscrawl' || action == 'uploadimage') {
            return '/file/uploadSingleImage';
        } else {
            return this._bkGetActionUrl.call(this, action);
        }
    }
</script>
</body>

</html>
