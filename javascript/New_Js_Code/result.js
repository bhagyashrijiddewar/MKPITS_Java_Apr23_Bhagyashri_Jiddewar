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

// ----**static array value**---

function myfun(){
    const cities=["nagpur","pune","mumbai"];
    cities.sort();
    for(var i=0;i<cities.length;i++){
        console.log(cities[i]);
    }
}

// ----**If user does not enter the value**----

function validateValue(number){
    if(number.length==0)
        alert("Please enter value");
    return false;
}

// ----**Sum of n Natural number **---

function naturalNumber(number){
    let sum=0;
    for(var i=number;i>1;i--){
        sum=sum+i;
    }
    document.write("Sum of n natural number = "+sum);
}

// ----**Number is a prime or not **---

function primeNumber(number){
   let isPrime=true;
    if(number===1){
        document.write("It is a composite number");
    }
    else if(number>1){
        for(var i=2;i<number;i++){
            if(number%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime)
            document.write("Number is a prime.");
        else
            document.write("Number is not prime.");
        }
    }

 //----** Reverse a String Using for Loop**----

 function reverseString(str){

    let newString="";
    for(let i=str.length-1;i>=0;i--){
        newString+=str[i];
    }
    document.write(newString);
 }

  //----** Reverse a String Using for Loop**----

  

    