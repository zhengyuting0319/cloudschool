<template>
  <v-app style="background-color:rgba(0,164,215,0.25)">
    <div style="margin-top: 30%">
      <v-avatar color="blue">
        <span class="white--text headline">Hi</span>
      </v-avatar>
    </div>
  <v-row  style="margin-left: 28%;">
    <v-form
      ref="form"
      v-model="valid"
      :lazy-validation="lazy"
    >
      <v-text-field
        v-model="name"
        :rules="nameRules"
        label="用户名"
        required
      ></v-text-field>
      <v-text-field
        v-model="password"
        :rules="passwordRules"
        label="密码"
        required
      ></v-text-field>
      <div style="margin-top: 5%">
        <v-btn
          color="blue"
          class="mr-4"
          @click="validate"
        >
          登录
        </v-btn>
        <v-btn
          @click="gotoRegister"
        >
          注册
        </v-btn>
      </div>

    </v-form>
  </v-row>
  </v-app>
</template>

<script>
    export default {
        data: () => ({
            name: '',
            nameRules: [
                v => !!v || '用户名必填',
            ],
            password: '',
            passwordRules: [
                v => !!v || '密码必填',
            ],
            lazy: false,
        }),

        methods: {
            validate () {
                this.$refs.form.validate()
                this.$router.push({path:'/Personal',query:{}});//传递参数
            },
            gotoRegister () {
                this.$router.push({path:'/Register',query:{}});//传递参数
            },
        },
    }
</script>

  <style scoped>

</style>
