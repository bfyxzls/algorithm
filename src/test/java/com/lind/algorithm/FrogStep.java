package com.lind.algorithm;

import org.junit.Assert;
import org.junit.Test;

public class FrogStep {
  @Test
  public void jump1_2() {
    Assert.assertEquals(3, jump(3));
    Assert.assertEquals(5, jump(5));

  }

  /**
   * 青蛙跳1步或者2步.
   *
   * @param target .
   * @return
   */
  int jump(int target) {
    if (target == 0) {
      return 0;
    } else if (target == 1) {
      return 1;
    } else if (target == 2) {
      return 2;
    } else {
      return jump(target - 1) + jump(target - 2);
    }

  }
}
