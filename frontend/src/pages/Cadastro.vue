<template>
  <div>
    <HelloWorld :msg="formattedTitle"/>
    <label>
      <span>Título:</span>
      <input v-model="idea.title">
    </label>
    <label>
      <span>Descrição:</span>
      <input v-model="idea.description">
    </label>
    <button @click="salvar">Salvar</button>
  </div>
</template>

<script>
export default {
  name: 'Cadastro',
  data: () => ({
    idea: {
      title: '',
      description: '',
      createdAt: new Date().getTime() // inicializa com a data/hora atual
    }
  }),
  computed: {
    formattedTitle() {
      if (this.idea.title)
        return 'Nova ideia: ' + this.idea.title;
      else
        return 'Nova ideia: sem título';
    }
  },
  methods: {
    async salvar() {
      await this.$http.post('http://localhost:8080/api/idea', this.idea).then(() => {
        // se salvar com sucesso, retorna pra tela de listagem (home)
        this.$router.push('/')
      }).catch(error => {
        // caso ocorra erro, exibirá um alerta com os detalhes do erro
        alert(error)
      });
    }
  }
}
</script>

<style scoped>
label {
  display: block;
  margin: 10px;
}
span {
  margin-right: 10px;
}
button {
  color: red;
}
</style>