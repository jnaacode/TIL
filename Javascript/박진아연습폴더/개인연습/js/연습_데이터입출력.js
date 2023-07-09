function fnAlert(){
    alert("얼럿 버튼 클릭됨!")
}

function documentWriter(){

    //document.write("<b>안녕하세요</b><br><br><h2>반가워요</h2>");
    let a = "<table border ='1'>";
    a += "<tr>";
    a += "<td>1</td>";
    a += "<td>2</td>";
    a += "</tr></table>";

    document.write(a);

}

function getInnerText(){
    
   const test1= document.getElementById("test1");
   console.log(test1.innerText);
    
}

function setInnerText(){
    const test1 = document.getElementById("test1");
    test1.innerText = "변경된 내용입니다.";

}

function getInnerHTML1(){
    const test2 = document.getElementById("test2");
    console.log(test2.innerHTML);
}

function setInnerHTML2(){
    const test2 = document.getElementById("test2");
    console.log(test2.innerHTML);
    test2.innerHTML = "<b>innerHTML로 변경된 내용</b> <br>반갑습니다.";

    console.log(test2.innerHTML);
}

function fnConfirm() {
    // 확인 
    if (confirm("버튼 배경색을 분홍색으로 바꾸시겠습니까?")) {
        document.getElementById("confirmBtn").style.backgroundColor = "pink";
    } else {
        document.getElementById("confirmBtn").style.backgroundColor = "green";
    }
}

function fnPrompt1(){
    var name = prompt("당신의 이름은 무엇입니까?");
    var age = prompt("당신의 나이는 몇 살입니까?");
    
    const divE1 = document.getElementById("area2");
    divE1.innerHTML="<br>앗! 당신이 바로 "+age+"살"+name+"닙이시군요?</br>"
}

function fnInput(){


    const input1 = document.getElementById("userId"); //아이디 input요소 
    const input2 = document.getElementById("userPwd"); //비밀번호  input요소 

    const id =input1.value;
    const pwd = input2.value;
    
    console.log(id);
    console.log(pwd);

    document.getElementById("area4").value =id+","+pwd;

    input1.value=null;
    input2.value=null;
}