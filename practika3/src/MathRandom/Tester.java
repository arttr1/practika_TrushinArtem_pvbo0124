package MathRandom;

import java.util.ArrayList;
import java.util.Collections;

public class Tester {
    ArrayList<Circle> circles = new ArrayList<>();
    int count;
    
    Circle getMaxCircle(){
        int maxRadiusIndex = 0;
        double maxR = 0;
        for (int i = 0; i < circles.size(); i++){
            double curR = circles.get(i).getRadius();
            if (curR > maxR){
                maxR = curR;
                maxRadiusIndex = i;
            }
        }

        return circles.get(maxRadiusIndex);
    }

    Circle getMinCircle(){
        int minRadiusIndex = 0;
        double minR = Double.MAX_VALUE;
        for (int i = 0; i < circles.size(); i++){
            double curR = circles.get(i).getRadius();
            if (curR < minR){
                minR = curR;
                minRadiusIndex = i;
            }
        }

        return circles.get(minRadiusIndex);
    }

    void sortCircles(){
        int n = circles.size();
        for(int i = 0; i < n; i++){
            for(int j = 0; j < (n - i - 1); j++){
                if (circles.get(j).getRadius() > circles.get(j+1).getRadius()){
                    Collections.swap(circles, j, j+1);
                }
            }
        }
    }


    void addCircle(Circle c) {
        circles.add(c);
    }

    ArrayList<Circle> getCircles(){
        return circles;
    }
}