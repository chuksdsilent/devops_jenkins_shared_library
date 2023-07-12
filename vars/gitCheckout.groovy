dev call(Map stageParams){
    gitCheckout([
        $class: 'GitSCM',
        branches: [[name: stageParams.branch]],
        userRemoteConfigs: [[ url: stageparams.url]]
    ])
}