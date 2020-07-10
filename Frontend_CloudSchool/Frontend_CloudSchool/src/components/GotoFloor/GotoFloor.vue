<template>
  <v-app :style="back">
    <div style="margin-right: 75%;margin-top: 5%" >
    <router-link  to="/">
      <img src="../../../static/icon/走廊图标.png" height="40" width="40" />
    </router-link>
    </div>
    <div>
      <router-link  to="/GotoClass">
      <div class="card">
      </div>
      </router-link>
    </div>
    </v-app>
</template>

<script>
    export default {
        name: "GotoFloor",
        data() {
            return {
                back: {
                    backgroundImage: "url(" + require("../../../static/picture/走廊偏移.png") + ")",
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
  width: 80%;
  height:600px;
  border-radius: 15px;
}
</style>
