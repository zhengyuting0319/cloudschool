<template>
  <v-app :style="back">
<div style="margin-right: 75%;margin-top: 5%" >
  <router-link  to="/Login">
    <img src="../../static/icon/主地图图标.png" height="40" width="40" />
  </router-link>
  <div>
    <router-link  to="/GotoFloor">
  <div class="card">
  </div>
    </router-link>
  </div>
</div>
  </v-app>
    </template>
<script>
    export default {
        data() {
            return {
                back: {
                    backgroundImage: "url(" + require("../../static/picture/主地图无图标.png") + ")",
                    backgroundRepeat: "no-repeat",
                    backgroundSize: "100% 100% ",
                    backgroundPosition: "fixed",
                    height:"100% " ,
                    width: "100%",
                },
            }
        },
    }
</script>
<style scoped>
  .card{
    margin-top: 2%;
    margin-left: 7%;
    display:inline-block;
    transition: 0.3s;
    width: 400px;
    height:600px;
    border-radius: 15px;
  }

</style>
