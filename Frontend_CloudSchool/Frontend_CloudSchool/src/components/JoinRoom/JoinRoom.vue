<template>
  <v-app style="background-color:rgba(0,164,215,0.25)">
    <div style="margin-top: 5%;color:white;font-weight:bold;font-size: x-large">
      加入房间
    </div>
    <div style="margin-top: 15%;color:white;font-weight:bold;font-size: large">
      请输入房间邀请码
    </div>
    <div style="margin-top: 5%">
      <v-text-field
        :counter="10"
        :error-messages="errors"
        required
      ></v-text-field>
    </div>
    <div class="my-2">
      <v-btn big color="primary"
             @click="gotoroom">
        加入</v-btn>
    </div>
    </v-app>
</template>

<script>
    export default {
        methods:{
            gotoroom () {
                this.$router.push({path:'/GotoClass',query:{}});//传递参数
            },
        }

    }
</script>

<style scoped>

</style>
