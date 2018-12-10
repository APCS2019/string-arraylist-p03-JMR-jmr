public int findNthOccurrence(String str, int n){
  int loc = -1;
  int count = 0;
  int start = 0;
  int sub = -1;
  while((loc = currentPhase.substring(strat).indexof(str))!=-1) ){
    loc += start;
    count++;
    if( count == n){
      return loc -1;
    }
    strat = loc+1;
  }
 return -1;
 }
 
 
 public int findNthOccurrence(String str, int n){
 int loc= -1;
 int count = 0;
 int start = 0;
 int sub = -1;
 while(count != n){
     sub = currentPhrase.subString(start).indexOf(str);
     if(sub == -1){
         retrun -1;
     }
    else if (count == n-1){ 
      return start + sub;
    }
    start += sub + 1;
    count++;
 }
        
 
