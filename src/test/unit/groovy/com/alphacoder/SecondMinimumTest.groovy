package groovy.com.alphacoder

import com.alphacoder.SecondMinimum
import spock.lang.Specification

class SecondMinimumTest extends Specification{

    def 'Test SecondMinimum | Sort | Input array is null'(){
        given:
        SecondMinimum secondMinimum= new SecondMinimum()

        when:
        int [] arr= null

        then:
        secondMinimum.findSecondMinimumSort(arr)== 0
    }

    def 'Test SecondMinimum | Sort | Input array has less than 2 elements'(){
        given:
        SecondMinimum secondMinimum= new SecondMinimum()

        when:
        int [] arr= new int[] {1}

        then:
        secondMinimum.findSecondMinimumSort(arr)== 0
    }

    def 'Test SecondMinimum | Sort | Input array has 2 elements'(){
        given:
        SecondMinimum secondMinimum= new SecondMinimum()

        when:
        int [] arr= new int[] {5, 6}

        then:
        secondMinimum.findSecondMinimumSort(arr)== 6
    }

    def 'Test SecondMinimum | Sort | Input array has same elements'(){
        given:
        SecondMinimum secondMinimum= new SecondMinimum()

        when:
        int [] arr= new int[] {5, 5, 5, 5, 5}

        then:
        secondMinimum.findSecondMinimumSort(arr)== 5
    }

    def 'Test SecondMinimum | Sort | Input array has different elements'(){
        given:
        SecondMinimum secondMinimum= new SecondMinimum()

        when:
        int [] arr= new int[] {5, 1, 7, 9, 3}

        then:
        secondMinimum.findSecondMinimumSort(arr)== 3
    }

    def 'Test SecondMinimum | Input array is null'(){
        given:
        SecondMinimum secondMinimum= new SecondMinimum()

        when:
        int [] arr= null

        then:
        secondMinimum.findSecondMinimum(arr)== 0
    }

    def 'Test SecondMinimum | Input array has less than 2 elements'(){
        given:
        SecondMinimum secondMinimum= new SecondMinimum()

        when:
        int [] arr= new int[] {1}

        then:
        secondMinimum.findSecondMinimum(arr)== 0
    }

    def 'Test SecondMinimum | Input array has 2 elements'(){
        given:
        SecondMinimum secondMinimum= new SecondMinimum()

        when:
        int [] arr= new int[] {5, 6}

        then:
        secondMinimum.findSecondMinimum(arr)== 6
    }

    def 'Test SecondMinimum | Input array has same elements'(){
        given:
        SecondMinimum secondMinimum= new SecondMinimum()

        when:
        int [] arr= new int[] {5, 5, 5, 5, 5}

        then:
        secondMinimum.findSecondMinimum(arr)== 5
    }

    def 'Test SecondMinimum | Input array has different elements'(){
        given:
        SecondMinimum secondMinimum= new SecondMinimum()

        when:
        int [] arr= new int[] {5, 1, 7, 9, 3}

        then:
        secondMinimum.findSecondMinimum(arr)== 3
    }

    def 'Test SecondMinimum | Input array has -ve elements'(){
        given:
        SecondMinimum secondMinimum= new SecondMinimum()

        when:
        int [] arr= new int[] {-5, -1, -7, -9, -3}

        then:
        secondMinimum.findSecondMinimum(arr)== -7
    }

    def 'Test SecondMinimum | Sort | Input array has -ve elements'(){
        given:
        SecondMinimum secondMinimum= new SecondMinimum()

        when:
        int [] arr= new int[] {-5, -1, -7, -9, -3}

        then:
        secondMinimum.findSecondMinimumSort(arr)== -7
    }
}
