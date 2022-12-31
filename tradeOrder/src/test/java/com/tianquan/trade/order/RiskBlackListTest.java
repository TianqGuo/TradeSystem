package com.tianquan.trade.order;

import com.tianquan.trade.order.service.RiskBlackListService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RiskBlackListTest {
    @Autowired
    public RiskBlackListService riskBlackListService;

    @Test
    public void insertBlackTest() {
        riskBlackListService.addRiskBlackListMember(1234570L);
    }

    @Test
    public void queryBlackTest(){
        riskBlackListService.isInRiskBlackListMember(1234570L);
    }
}
