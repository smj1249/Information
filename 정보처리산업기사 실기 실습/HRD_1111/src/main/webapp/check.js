function add() {
	if (document.frm.sid.value.length == 0) {
		alert("학번이 입력되지 않았습니다!람쥐");
		document.frm.sid.focus();
		return false;
	}

	else if (document.frm.midscore.value.length == 0) {
		alert("중간고사는 숫자가 아니거나 입력하지 않았습니다!");
		document.frm.midscore.focus();
		return false;
	}

	else if (document.frm.finalscore.value.length == 0) {
		alert("기말고사는 숫자가 아니거나 입력하지 않았습니다!");
		document.frm.finalscore.focus();
		return false;
	}

	else if (document.frm.attend.value.length == 0) {
		alert("출석은 숫자가 아니거나 입력하지 않았습니다!");
		document.frm.attend.focus();
		return false;
	}

	else if (document.frm.report.value.length == 0) {
		alert("레포트는 숫자가 아니거나 입력하지 않았습니다!");
		document.frm.report.focus();
		return false;
	}

	else if (document.frm.etc.value.length == 0) {
		alert("기타는 숫자가 아니거나 입력하지 않았습니다!");
		document.frm.etc.focus();
		return false;
	}
	
	else {
		alert("성적정보가 정상으로 등록되었습니다!");
		document.frm.submit();  // 오타 수정!!
		return true;
	}
}

function res() {
	alert("정보를 지우고 처음부터 다시 입력합니다!");
	document.frm.reset();
}

function search(){
	dcoument.frm2.submit();
}
