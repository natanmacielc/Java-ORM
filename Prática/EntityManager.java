EntityManager entityManager = Persistence.createEntityManagerFactory("persistente-unit");

entityManager.getTransaction().begin();

Pessoa pessoa = new Pessoa();
pessoa.setId(1);
pessoa.setSobrenome("Silva");
pessoa.setPrenome("João");
pessoa.setNumeroDeDependentes(2);

entityManager.persist(pessoa);
entityManager.getTransaction().commit();