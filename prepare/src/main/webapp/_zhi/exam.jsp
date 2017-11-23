<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script>
	var isMatch = function(s, p) {
		if (/\*+|\.+/.test(p)) {
			var re = new RegExp(p);
			return re.test(s);
		} else {
			return p == s;
		}
	};
	/*
	 console.log(isMatch("aa","a")); //false
	 console.log(isMatch("aa","aa"));//true
	 console.log(isMatch("aaa","aa"));//false
	 console.log(isMatch("aa","a*"));//true
	 console.log(isMatch("aa",".*"));//true
	 console.log(isMatch("ab",".*"));//true
	 console.log(isMatch("aab","c*a*b"));//true
	 console.log(isMatch("abcd","d*"));//false
	 */

	var calculate = function(s) {
		var ary = s.split(' ');
		var text = "";
		for (var i = 0; i < ary.length; i++) {
			text += ary[i];
		}
		console.log(text);
		var notLastCal = true;
		while (text.lastIndexOf('(') != -1 || notLastCal) {
			if (text.lastIndexOf('(') == -1) {
				notLastCal = false;
			}
			var idx2 = text.length;
			var sub1 = text.substring(0, idx2);
			var idx1 = 0;
			var calText = text;
			if (notLastCal) {
				idx2 = text.indexOf(')');
				sub1 = text.substring(0, idx2);
				idx1 = sub1.lastIndexOf('(');
				calText = sub1.substring(idx1 + 1);
			}
			var calAry = calText.split(/\+|\-/);
			var num1 = 0;
			var num2 = 0;
			var calMIdx = -1;
			for (var i = 0; i < calAry.length; i++) {
				if(calAry[i]==""){
					text=calText;
					num1=text;
					break;
				}
				num2 = parseInt(calAry[i]);
				if (calText[calMIdx] == '+') {
					num1 = num1 + num2;
				} else if (calText[calMIdx] == '-') {
					num1 = num1 - num2;
				} else {
					num1 = num2;
				}
				calMIdx = calMIdx + calAry[i].length + 1;
			
			}
			if (num1 < 0) {
				if (text.charAt(idx1 - 1) == '-') {
					text = text.substring(0, idx1 - 1)+'+' + Math.abs(num1)
							+ text.substring(idx2 + 1);
				} else {
					text = text.substring(0, idx1 - 1) + num1
							+ text.substring(idx2 + 1);
				}
			} else {
				text = text.substring(0, idx1) + num1
						+ text.substring(idx2 + 1);
			}
			console.log(text);
		}
		return parseInt(text);
	}; 
	console.log('final' + calculate('(2+(1+(1-9)))'));
</script>
</head>
<body>HI
</body>
</html>