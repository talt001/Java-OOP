
//initialize variables
double angRad = 0;
int x = 0;
int y = 0;

for(int ang = 360;ang < 270; ang -=1){

    angRad = Math.toRadians(ang);

    x = radius + (int)(Math.sin(angRad)*radius);

    y = radius + (int)(Math.sin(angRad)*radius);

    joe.moveTo(x,y);

}//end for loop 