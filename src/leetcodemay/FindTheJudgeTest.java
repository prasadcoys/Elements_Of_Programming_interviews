package leetcodemay;

import org.junit.Assert;
import org.junit.Test;

public class FindTheJudgeTest {

    @Test
    public void testIfJudgeCanBeFoundInTwoMemmbers(){
        int[][] trust = new int[][]{{1,2}};
        Assert.assertEquals(2,new FindTheJudge().findJudge(2,trust));
    }

    @Test
    public void testIfJudgeCanBeFoundAmongThreeMembers(){
        int[][] trust = new int[][]{{1,3},{2,3}};
        Assert.assertEquals(3,new FindTheJudge().findJudge(3,trust));
    }

    @Test
    public void testIfJudgeCannotBeFoundWhenAllPeopleAreTrusters(){
        int[][] trust = new int[][]{{1,3},{2,3},{3,1}};
        Assert.assertEquals(-1,new FindTheJudge().findJudge(3,trust));
    }

    @Test
    public void testIfJudgeCannotBefoundWhenNotAllPeopleTrustJudge(){
        int[][] trust = new int[][]{{1,2},{2,3}};
        Assert.assertEquals(-1,new FindTheJudge().findJudge(3,trust));
    }

    @Test
    public void testIfJudgeCanBefoundAmongFourPeople(){
        int[][] trust = new int[][]{{1,3},{1,4},{2,3},{2,4},{4,3}};
        Assert.assertEquals(3,new FindTheJudge().findJudge(4,trust));
    }

    @Test
    public void testIfWeCanFindJudgeAmongOnlyOnePerson(){
        int[][] trust = new int[][]{};
        Assert.assertEquals(1,new FindTheJudge().findJudge(1,trust));


    }

}
