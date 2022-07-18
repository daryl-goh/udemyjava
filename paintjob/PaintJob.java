package paintjob;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1; 
        }
        double wallarea = width * height;
        double numberofbuckets = (wallarea / areaPerBucket) - extraBuckets; 
        return (int) Math.ceil(numberofbuckets);
    }
    
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1; 
    }
        double wallarea = width * height;
        double numberofbuckets = (wallarea / areaPerBucket); 
        return (int) Math.ceil(numberofbuckets);
    } 

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1; 
    }
        double numberofbuckets = (area / areaPerBucket); 
        return (int) Math.ceil(numberofbuckets);
    }
}
