



function minToFront(arr){
    // if length of the arr is null
    if(arr!=0){
        min_index=0;
        min_elemt=arr[min_index];

        for(var index=1;index<arr.length;index++){
            // if min_elemt>current elemtnt
            if(min_elemt>arr[index]){
                //make the curent index is the min index
                min_index=index;
                // make the min_elemt=curentelement
                min_elemt=arr[index];

            }

        }
        //Now we found the min_elemt;lets move it to the front
        for(var index2=min_elemt;index2>0;index2--){
            arr[index2]=arr[index2-1];
        }
//finally 
        arr[0]=min_elemt;

    }
     
    
    return arr;

}

var test_arr=[4,2,1,3,5];
console.log( test_arr);
// var test_arr=[];
console.log(minToFront(test_arr));