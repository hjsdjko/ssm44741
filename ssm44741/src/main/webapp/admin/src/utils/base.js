const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm44741/",
            name: "ssm44741",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm44741/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "高校寻物平台小程序"
        } 
    }
}
export default base
