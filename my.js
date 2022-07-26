function minimumDistances(a) {
    // Write your code here
    //first we will check if there are occurrence of any number in list
    let min = a.length;
    for(let i=0; i<a.length; i++){
        for(let j=i+1; j<a.length; j++){
            if(a[i]==a[j]){
                let d = j-i;
                if(d< min){
                    min = d;
                }
            }
        }
    } if(min == a.length){
        return -1;
    }
    return min;
    }