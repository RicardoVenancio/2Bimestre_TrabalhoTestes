package dao;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import entity.Sindico;

public class sindicoDaoTest {

	@Test
	public void testInserir() {
		boolean b;
		b = sindicoDao.inserir(null);
		Assert.assertFalse(b);
		
	}

//	@Test
//	public void testListAll() {
//		fail("Not yet implemented");
//	}
//
//	@Test
//	public void testFindByID() {
//		fail("Not yet implemented");
//	}
//
	@Test
	public void testAlterar() {
		boolean b; 
		b = sindicoDao.alterar(null);
		Assert.assertFalse(b);
	}

	@Test
	public void testDeletar() {
		sindicoDao sind = new sindicoDao();
		assertEquals("Caso 1",1,sind.deletar(1));
//		boolean b; 
//		b = sindicoDao.deletar(r);
//		Assert.assertFalse(b);
	}

}
