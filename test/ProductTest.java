import com.entry.AnyItem;
import com.entry.AnyOrder;
import com.entry.AnyOrderItem;
import com.entry.AnyUser;
import com.util.HibernateUtil;
import org.hibernate.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

public class ProductTest {

    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;

    @Before
    public void init() {
        session = HibernateUtil.getSession();
        //开启事务
        transaction = session.beginTransaction();

    }

    @After
    public void destroy() {
        transaction.commit();
    }

    @Test
    public void testSave(){
        AnyUser user = new AnyUser("aaaa","123131",1,"3313",new Date(),"dddddddddd");
        session.save(user);
    }

    @Test
    public void testQuery(){
        String hql = "from AnyUser";
        Query query = session.createQuery(hql);
        List<AnyUser> users = query.list();
        for (AnyUser user : users) {
            System.out.println(user.toString());
        }
    }

    @Test
    public void testMain(){
        AnyUser user = new AnyUser("James Bond","123456789",1,"353290933@qq.com",new Date(),"白月光");
        AnyItem item = new AnyItem("MacBookPro",9868.6,9898.3,"Apple","China",1,"","4548-dsd8-865d-78sd",new Date(),new Date(),1,1,"sdsdd","sadsadad");
        AnyOrder order = new AnyOrder(user,new Date(),new Date(),5,95845.56);
        AnyOrderItem orderItem = new AnyOrderItem(order,item,1.0,48787.4,45);
        session.save(user);
        session.save(item);
        session.save(order);
        session.save(orderItem);
    }

}
