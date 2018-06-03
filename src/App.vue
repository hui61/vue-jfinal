<template>
  <div id="app">
    <img src="./assets/logo.png">
    <h1>后端数据为：{{serverData}}</h1>
    <button v-on:click="getdata()">获得后端数据</button>
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App',
  data(){
    return {
      serverData:"页面数据"
    }
  },
  methods:{
    getdata(){
      this.$http.get('http://localhost:8082/demo').then(function(response){
        this.serverData=response.data
      })
    }
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
