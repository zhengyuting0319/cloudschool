<template>
  <v-app :style="back">
    <div style="margin-right: 75%;margin-top: 5%" >
    <router-link  to="/Personal">
      <img src="../../../static/icon/教室图标.png" height="60" width="60"/>
    </router-link>
    </div>
    <div style="margin-top:125%;color:white;font-weight:bold;font-size: large">
      你的房间邀请码：123456
    </div>
    </v-app>
</template>

<script>
    export default {
        name: "GotoFloor",
        data() {
            return {
                back: {
                    backgroundImage: "url(" + require("../../../static/picture/教室无图标.png") + ")",
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

</style>
