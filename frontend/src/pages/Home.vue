<template>
  <div>
    <HelloWorld :msg="msg"/>
    <button v-on:click="abrirCadastro">Cadastro</button>
    <table>
      <tr class="header">
        <td>Título</td>
        <td>Descrição</td>
        <td>Criado em</td>
      </tr>
      <tr v-for="idea in ideas" :key="idea.id">
        <td>{{idea.title}}</td>
        <td>{{idea.description}}</td>
        <td>{{idea.createdAt}}</td>
      </tr>
    </table>
  </div>
</template>

<script>
export default {
  name: 'Home',
  // esta função retornará as variáveis utilizadas pela tela
  data: () => ({
    msg: 'Listagem de ideias',
    ideas: []
  }),
  methods: {
    // local onde registramos/implementamos as ações que a tela poderá chamar durante interação do usuário
    abrirCadastro() {
      // abrirá a tela de cadastro
      this.$router.push('/Cadastro')
    }
  },
  async mounted() {
    // neste método podemos realizar chamadas às apis para carregar a tela,
    // é chamado quando o vuejs, os elementos html e seus eventos estão prontos no browser
    const ideas = await this.$http.get('http://localhost:8080/api/idea', {})
    this.ideas = ideas.data
  }
}
</script>

<style scoped>
/* local onde podemos colocar o css para estilizar os elementos html */
table {
  margin: 10px;
  width: 99%;
  border: 1px solid gray;
}

.header {
  font-weight: bold;
}

tr:nth-child(even) {
  background-color: #f2f2f2
}
</style>