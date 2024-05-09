class Sorting{
    
     sorting(){
        var array=[
            {
            name:"a",
            salary:15
            },
            {name:"b",
            salary:16
            },
            {name:"b",
            salary:2
            }
        ];
        var new_array=array.sort((i,k)=>{
            if(i.salary>k.salary){
                return i.salary;
            }else{
                return k.salary;
            }
        })
        console.log(new_array);
     }
}