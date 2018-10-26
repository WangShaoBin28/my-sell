<!DOCTYPE html>
<html>

	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1,maximum-scale=1,user-scalable=no" />
		<title>后台登录</title>
		<link rel="stylesheet" type="text/css" href="../../admin/layui/css/layui.css" />
		<link rel="stylesheet" type="text/css" href="../../admin/css/login.css" />
	</head>

	<body>
		<div class="m-login-bg">
			<div class="m-login">
				<h3>后台系统登录</h3>
				<div class="m-login-warp">
					<form class="layui-form">
						<div class="layui-form-item">
							<input type="text" name="phoneNumber" required lay-verify="password" placeholder="用户名" autocomplete="off" class="layui-input">
						</div>
						<div class="layui-form-item">
							<input type="password" name="password" required lay-verify="password" placeholder="密码" autocomplete="off" class="layui-input">
						</div>
						<div class="layui-form-item">
							<div class="layui-inline">
								<input type="text" name="verity" required lay-verify="verity" placeholder="验证码" autocomplete="off" class="layui-input">
							</div>
							<div class="layui-inline">
								<img class="verifyImg" onclick="this.src=this.src+'?c='+Math.random();" src="../../admin/images/login/yzm.jpg" />
							</div>
						</div>
						<div class="layui-form-item m-login-btn">
							<div class="layui-inline">
								<button class="layui-btn layui-btn-normal" lay-submit lay-filter="login">登录</button>
							</div>
							<div class="layui-inline">
								<button type="reset" class="layui-btn layui-btn-primary">取消</button>
							</div>
						</div>
					</form>
					<div id="message" style="color: red"></div>
				</div>
				<p class="copyright">Copyright 2018-2019 by WangShaoBin</p>
			</div>
		</div>
	  <#include "../common/js.ftl">
        <script>
            layui.use(['form', 'layedit', 'laydate', 'jquery'], function () {
                var form = layui.form(), layer = layui.layer, $ = layui.jquery;

                //自定义验证规则
               form.verify({
                    password: function (value) {
                        if (value == '') {
                            return '请输入密码！';
                        }
                    },
                    verity: function (value) {
                        if (value == '') {
                            return '请输入验证码！';
                        }
                    }
                });

                //监听提交
                form.on('submit(login)', function (data) {
                    var phoneNumber = $("input[name='phoneNumber']").val();
                    var password = $("input[name='password']").val();
                    var verity = $("input[name='verity']").val();
                    if (phoneNumber != '' && password != '' && verity != '') {
                        $("#message").text("正在登陆！");
                        $.ajax({
                            url: "/checkLogin",
                            method: 'POST',
                            data: JSON.stringify(data.field),
                            dataType: 'JSON',
                            contentType: "application/json",
                            success: function (res) {
                                if (res.success == true) {
                                    window.location.href = '/index';
                                } else {
                                    $("#message").text(res.message);
                                }
                            },
                            error: function (data) {

                            }
                        });
                    }
                    return false;
                });
            });
        </script>
	</body>
</html>