package Test;

import org.junit.runner.RunWith;

import java.util.List;

import org.junit.Test;

import org.springframework.beans.factory.annotation.Autowired;

import com.cognizant.bingo.account.AccountApplication;
import com.cognizant.bingo.account.domain.Account;
import com.cognizant.bingo.account.repository.IAccountRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(AccountApplication.class)
public class AccountRepositoryIntegrationTest {
	@Autowired
	private IAccountRepository accountRepository;

	@Test
	public void testFindAll() {
		List<Account> account = accountRepository.findAll();
		assertThat(account.size(), is(greaterThanOrEqualTo(0)));
	}
	
}