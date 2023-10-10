// ----**Accept input from user**---

function validate(){
    marks=prompt("Enter marks :");
    if(marks>80)
       document.write("pass");
    else
       document.write("Fail");
}

// ----**Static input from user**---

function UserInput(marks){
    if(marks>60)
     document.write("Pass");
    else
     document.write("Fail");
}

// ----**User define input from front end **---

function myfun(){
    const cities=["nagpur","pune","mumbai"];
    cities.sort();
    for(var i=0;i<cities.length;i++){
        console.log(cities[i]);
    }
}

// ----**User define input from front end **---

function validateValue(number){
    if(number.length==0)
        alert("Please enter value");
    return false;
    
}